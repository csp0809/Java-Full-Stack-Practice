import Link from 'next/link';

export default function NotFound() {
  return (
    <div className="min-h-screen flex flex-col items-center justify-center bg-gray-100 text-gray-800 px-4">
      <h2 className="text-4xl font-bold text-red-600 mb-4">404 - Not Found</h2>
      <p className="text-lg mb-6 text-center">
        Sorry, the page you’re looking for doesn’t exist.
      </p>
      <Link
        href="/"
        className="px-6 py-2 bg-blue-600 text-white rounded hover:bg-blue-700 transition"
      >
        Return Home
      </Link>
    </div>
  );
}